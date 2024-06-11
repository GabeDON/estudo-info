

:: --------------------------------------------------------
:: chromeOpen.bat
::
:: Description: abrir arquivos .html com o chrome
:: Autor: gdon - gabriel.lopesWC@outlook.com
:: Version: 1.0
:: Data: 29/02/2024 22:25:47,90
:: --------------------------------------------------------

:: O seu código começa aqui

@echo off
set "NomeArquivo=%~1"

if "%NomeArquivo%"=="" (
    echo Por favor, forneça o nome do arquivo HTML a ser aberto.
    pause
    exit /b
)

set "CaminhoArquivo=%cd%\%NomeArquivo%"

if not exist "%CaminhoArquivo%" (
    echo O arquivo especificado não foi encontrado.
    pause
    exit /b
)

start chrome "file:///%CaminhoArquivo%"


:: --------------------------------------------------------
:: Fim do script
:: --------------------------------------------------------
pause
exit /b
