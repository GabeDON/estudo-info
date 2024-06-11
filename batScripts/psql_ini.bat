@echo off

:: --------------------------------------------------------
:: psql_ini.bat
::
:: Description: entrada no banco de dados
:: Autor: gdon - gabriel.lopesWC@outlook.com
:: Version:
:: Data: 10/04/2024 17:14:57,77
:: --------------------------------------------------------



:: O seu código começa aqui

psql -U postgres -h localhost 

:: Nota: Usado apenas para localhost!

:: --------------------------------------------------------
:: Fim do script
:: --------------------------------------------------------
pause
exit /b
