@echo off

:: --------------------------------------------------------
:: jcomp.bat
::
:: Description: Script to compile and optionally execute Java files
:: Version: 0.7
:: Author: gdon - gabriel.lopesWC@outlook.com
:: Date: 05/02/2024 13:52:10,34
:: --------------------------------------------------------

:: Check if at least one argument is provided
if "%1"=="" (
    echo Usage: %0 [classpath] java_file
    goto :eof
)

:: Check if src and bin directories exist; if not, execute the groom script
if not exist .\src\ (
    call groom.bat
)

if not exist .\bin\ (
    call groom.bat
)

:: If there are two arguments, the first one is the classpath
if not "%2"=="" (
    set "classpath=%1"
    set "java_file=%2"
) else (
    set "classpath=."
    set "java_file=%1"
)

:: Create the bin folder structure if it does not exist
if not exist .\bin\ (
    mkdir .\bin\
)

:: Compile the Java file
javac -d .\bin\ -cp "%classpath%" .\src\%java_file%.java

:: Check if the compilation was successful
if errorlevel 1 (
    echo Error during compilation.
    pause
    exit /b 1
)

:execute
:: Ask the user if they want to run the compiled Java file
set /p run_java=Do you want to run the compiled Java file? (Y/N): 
if /i "%run_java%"=="Y" (
    :: Run the compiled Java file
    java -cp .\bin\;%classpath% %java_file%
)

:: --------------------------------------------------------
:: End of the script
:: --------------------------------------------------------
pause
exit /b
