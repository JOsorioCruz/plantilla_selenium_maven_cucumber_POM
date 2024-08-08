Feature: Login

  Scenario: Successful login with valid credentials
    Given Abro la ventana de inicio
    When ingreso usuario y contrasena
    And hago click en el boton sing up
    Then alerta de registro exitoso
