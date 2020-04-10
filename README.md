## DogeCV Quickstart

**A vision library with field-ready opmodes for FTC based off of DogeCV/OpenCV**

## Welcome!
This repository is a library based off of the DogeCV computer vision for FTC. DogeCV is an adaptation of the OpenCV library made for First Tech Challenge teams. To use DogeCv with a robot, you will need a camera. You can either use the phone's camera or use a webcame. Teams most commonly use a 720p webcame like [this](https://www.amazon.com/Logitech-Webcam-Portable-Calling-Autofocus/dp/B004WO8HQ4). In this library is the code that will detect game elemnts in a simple java class. From there, you can implement the code into your teams autonomous program or anything else. The code you will need is specified in the file. The other option is to use the pre-made sample autonomous op-mode that has the code that will detect game elements in a cconditional and from there you can specify the functions you want your robot to do. If you want to use DogeCV Quickstart with more advance autonomous programs like Roadrunner or Pure Pursuit, check out our [FTC lib repository](https://github.com/AlessioToniolo/FTC-lib). 

## Important Information
This library is based off of the DogeCV library that will change every year for each new game. Since it is not bare OpenCV code, we save you time because you will not need to code your own detectors again for each years game. The way we accomplish this is by organizing each years game into a branch. Once a new game begins, we will merge the new code into the repository. If you need to access past years game code, just check out it's branch in Branches. **Current Branch: Skystone**

## Getting Started
Clone or download this repository and open it in Android studio, or copy the code files into your team's Android Studio project. You will also need a file for your robot phone for DogeCV to work in order to use the detector for your camera. You can copy and paste this file from [here](https://github.com/AlessioToniolo/DogeCV-Quickstart/blob/Skystone/libOpenCvNative.so) into your phones folder on your computer. *If you are copying code files into your own android studio project, you will need to follow the steps below for adding dependencies.*

### Adding Dependencies
1. Go to the root `build.gradle`
2. To the repositories section, add the lines 
```groovy
allprojects {
  repositories {
    maven { url 'https://jitpack.io' } // this line!
  }
}
```
3. Add the line `implementation 'com.github.dogecv:dogecv:2020.4-alpha'` to TeamCode's `build.release.gradle`, inside the dependencies block
4. Press the `Sync Now` button that should appear in the top right


