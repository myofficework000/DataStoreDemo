package com.example.datastore

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.datastore.ui.theme.DataStoreSampleTestingTheme
import com.code4galaxy.datastore.Locator
import com.code4galaxy.datastore.domain.model.Theme
import com.code4galaxy.datastore.ui.MainScreen
import com.code4galaxy.datastore.ui.MainViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<MainViewModel>(factoryProducer = { Locator.mainViewModelFactory })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val theme by viewModel.theme.collectAsState()

            val darkTheme = when (theme) {
                Theme.NIGHT_YES -> false
                Theme.NIGHT_NO -> true
                Theme.NIGHT_UNSPECIFIED -> isSystemInDarkTheme()
                null -> return@setContent
            }

            DataStoreSampleTestingTheme(darkTheme = darkTheme) {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    val state by viewModel.state.collectAsState()

                    MainScreen(
                        state = state,
                        changeShowCompleted = viewModel::changeShowCompleted,
                        enableSortByDeadline = viewModel::enableSortByDeadline,
                        enableSortByPriority=viewModel::enableSortByPriority,
                        lightTheme = !darkTheme,
                        changeTheme = viewModel::changeTheme,
                    )
                }
            }
        }
    }
}
