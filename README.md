# coloring-app
A coloring app that gives the user simple functionalities like using 
a brush to draw on a canvas and be able to change the color of the 
brush, clear the convas or just earse parts of the drawing. 
The app also has the functionality to have the user input text and 
be able to return the same text with a random color. It also returns 
the color code of the random color. 

![Image of homescreen](https://github.com/yousif92/coloring-app/blob/master/resources/homescreen.png)
![Image of homescreen](https://github.com/yousif92/coloring-app/blob/master/resources/textColor.png)
![Image of homescreen](https://github.com/yousif92/coloring-app/blob/master/resources/freeDraw.png)

## How to use
The has two main functions, the first one is to be able to enter a text and get the same text back with a random color.
the second one is to be able to draw and use multiple colors and functions.

## Libraries used
### AndroidDraw
https://github.com/divyanshub024/AndroidDraw

this library allows the user to be able to add an draw view to be able to draw on it. 
to use it we need to add 
dependencies {
	        implementation 'com.github.divyanshub024:AndroidDraw:v0.1'
	}
we can call the Drawing Activity using startActivityForResult which will return you bitmap in byteArray. By using this method you will have all the features like change strokeWidth, change strokeColor, change Alpha, erase, redo, undo.

### AndroidRandomColor
https://github.com/lzyzsd/AndroidRandomColor

This libray is able to genrate a random color everytime the user presses a button if they press a button for example. 
to use it we need to add 
dependencies {
    compile 'com.github.lzyzsd.randomcolor:library:1.0.0'
}

### App desgin
the app has three activities, the first one is the main one from which you can go to the other activities. 
the second activity is the textColor activity which is where you can input text and change the color of the outputed text. 
the third activity is the one where you can draw. 




