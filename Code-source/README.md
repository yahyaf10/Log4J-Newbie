# src / aljilogy / HW_BasicConfiguratior 1 

HelloWorld using BasicConfigurator to quickly configure the package. 
* Create an instance of Logger
* Configure log4j , th simple way is using `BasicConfigurator.configure()` . It will use by default the _ConsoleAppender_.
* now you can start logging, I used : _info()_, _debug()_, _warn()_, _error()_ and _fatal()_.  Each method represents a logger level namely DEBUG, INFO, WARN, ERROR and FATAL. 
--> The output contains the time elapsed from the start of the program in milliseconds, the thread name, the logger level, the class name and the log message.

Source [DZone Tutorial log4J](http://www.dzone.com/tutorials/java/log4j/log4j-configuration.html)


# src / aljilogy / HW_PropertyConfigurator 2 

This HelloWorld will use an external properties file (an xml file) to configure Log4J. The aim is to allow configuration independently from the code. 
You will get the same previous output, but using this time an external properties file for configuration.

The file name is **log4j.properties**. 

Source [DZone Tutorial log4J](http://www.dzone.com/tutorials/java/log4j/sample-log4j-properties-file-configuration-1.html).

