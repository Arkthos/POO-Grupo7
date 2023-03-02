import javax.swing.JOptionPane; // Importa la clase JOptionPane, que se utiliza para mostrar ventanas de diálogo.123

public class Main {

    public static void main(String[] args) {
        // Crea una instancia de la clase LoginModule para manejar la autenticación de usuarios.
        LoginModule loginModule = new LoginModule();

        // Ciclo para repetir el menú de autenticación hasta que se seleccione una opción válida o se elija la opción para salir.
        boolean authenticationLoop = true;
        while (authenticationLoop) {
            // Muestra un prompt con las opciones "Iniciar sesión", "Registrarse" y "Salir".
            String[] options = { "Iniciar sesión", "Registrarse", "Salir" };
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Módulo de autenticación", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                // Si se selecciona "Iniciar sesión", llama al método de la clase LoginModule para mostrar el prompt de inicio de sesión.
                boolean loginSuccessful = loginModule.showSignInPrompt();
                if (loginSuccessful) {
                    // Si el inicio de sesión es exitoso, muestra un menú de opciones.
                    boolean menuLoop = true;
                    while (menuLoop) {
                        String[] menuOptions = { "Opción 1", "Opción 2", "Opción 3", "Salir" };
                        int menuChoice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menuOptions, menuOptions[0]);
                        switch (menuChoice) {
                            case 0:
                                // Agregar lógica para la opción 1 del menú.
                                break;
                            case 1:
                                // Agregar lógica para la opción 2 del menú.
                                break;
                            case 2:
                                // Agregar lógica para la opción 3 del menú.
                                break;
                            case 3:
                                // Si se selecciona la opción "Salir", se establece la variable menuLoop en false para salir del ciclo.
                                menuLoop = false;
                                break;
                            default:
                                // Si se selecciona una opción inválida, muestra un mensaje de error.
                                JOptionPane.showMessageDialog(null, "Opción inválida.");
                                break;
                        }
                    }
                }
            } else if (choice == 1) {
                // Si se selecciona "Registrarse", llama al método de la clase LoginModule para mostrar el prompt de registro.
                loginModule.showSignUpPrompt();
            } else if (choice == 2) {
                // Si se selecciona "Salir", se establece la variable authenticationLoop en false para salir del ciclo.
                authenticationLoop = false;
            } else {
                // Si se selecciona una opción inválida, muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }

}
