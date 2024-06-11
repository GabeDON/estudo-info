@echo off
setlocal enabledelayedexpansion

REM Verifica se foi passado um argumento
if "%1"=="" (
    echo Por favor, forneca um nome para o novo script.
    exit /b 1
)

REM Defina o local padrão para os scripts
set "scriptPath=D:\program\batScripts"

REM Obtém o nome do script a partir do primeiro argumento
set "scriptName=%~1"

REM Verifica se o arquivo já existe
if exist "%scriptPath%\%scriptName%.bat" (
    echo O arquivo %scriptName%.bat ja existe. Escolha outro nome.
    exit /b 1
)

REM Cria o caminho completo para o novo script
set "scriptFullPath=%scriptPath%\%scriptName%.bat"

REM Cria o cabeçalho bonito para o novo script
set "headerFile=%temp%\header.txt"
(
    echo @echo off
    echo.
    echo :: --------------------------------------------------------
    echo :: %scriptName%.bat
    echo ::
    echo :: Description: Script para ...
    echo :: Autor: gdon - gabriel.lopesWC@outlook.com
    echo :: Version:
    echo :: Data: !date! !time!
    echo :: --------------------------------------------------------
    echo.
    echo.
    echo.
    echo :: O seu código começa aqui
    echo.
    echo.
    echo :: --------------------------------------------------------
    echo :: Fim do script
    echo :: --------------------------------------------------------
    echo pause
    echo exit /b
) > "%headerFile%"

REM Anexa o cabeçalho ao novo script
type "%headerFile%" > "%scriptFullPath%"

REM Abre o novo script no Notepad++
start sublime "%scriptFullPath%"

echo Novo script criado com sucesso: %scriptFullPath%
exit /b 0


