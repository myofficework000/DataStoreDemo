# DataStoreDemo

This project is a demonstration of implementing Android Jetpack's DataStore for data management within a Jetpack Compose app. It follows a clean code architecture, providing a foundation for utilizing DataStore in real-world applications.

## Features
- Display a list of task
- Sort the task by Priority
- Sort the task by Deadline
- Change the app theme
- delete task [Upcoming]
- delete all task [upcoming]


## Overview
DataStoreDemo showcases two types of DataStore:
1. **Preferences DataStore**: Simple key-value storage for primitive data types.
2. **Proto DataStore**: Structured data storage using Protocol Buffers for complex data objects.

## Features
- **Jetpack Compose UI**: Modern, declarative UI for Android.
- **DataStore Implementation**: Demonstrates both Preferences and Proto DataStores.
- **Clean Architecture**: Separates concerns into different layers for maintainability.
- **Coroutines and Flow**: Manages asynchronous data operations.

## Setup
To get started:
1. Clone the repository:
   ```bash
   git clone https://github.com/myofficework000/DataStoreDemo.git
Open the project in Android Studio and sync Gradle.
Ensure your Android SDK is up-to-date (API level 21 or higher).

## Usage
This app demonstrates reading and writing data in a reactive way:

Preferences DataStore: Stores simple user settings.
Proto DataStore: Stores structured data with custom fields.
Example usage for storing preferences data:


dataStore.edit { preferences ->
    preferences[PreferencesKeys.EXAMPLE_KEY] = "example_value"
}

## Technologies Used
Kotlin for programming language.
Jetpack Compose for UI.
DataStore (Preferences and Proto) for data storage.
Coroutines and Flow for async programming.

## Contributing
Contributions are welcome! Feel free to submit a pull request with your improvements.

