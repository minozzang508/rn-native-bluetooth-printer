
# react-native-sewoo-android-printer

## Getting started

`$ npm install react-native-sewoo-android-printer --save`

### Mostly automatic installation

`$ react-native link react-native-sewoo-android-printer`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.payhere.sewoo.RNSewooAndroidPrinterPackage;` to the imports at the top of the file
  - Add `new RNSewooAndroidPrinterPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-sewoo-android-printer'
  	project(':react-native-sewoo-android-printer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-sewoo-android-printer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-sewoo-android-printer')
  	```


## Usage
```javascript
import RNSewooAndroidPrinter from 'react-native-sewoo-android-printer';

// TODO: What to do with the module?
RNSewooAndroidPrinter;
```
  