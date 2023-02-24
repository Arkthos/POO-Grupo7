import java.io.File; // Importa la clase File, que se utiliza para trabajar con archivos.
import java.io.FileWriter; // Importa la clase FileWriter, que se utiliza para escribir en archivos.
import java.io.IOException; // Importa la clase IOException, que se utiliza para manejar errores de entrada/salida.
import java.util.HashMap; // Importa la clase HashMap, que se utiliza para almacenar pares clave-valor.
import java.util.Map; // Importa la interfaz Map, que se utiliza para trabajar con colecciones de pares clave-valor.
import java.util.Scanner; // Importa la clase Scanner, que se utiliza para leer entradas desde el usuario.
import javax.swing.JOptionPane; // Importa la clase JOptionPane, que se utiliza para mostrar ventanas de diálogo.

public class LoginModule {
    private final Map<String, String> users; // Declara un campo de tipo Map para almacenar los usuarios y contraseñas.

    public LoginModule() {
        this.users = new HashMap<>(); // Inicializa el campo users con una nueva instancia de HashMap.
        loadUsers(); // Carga los usuarios y contraseñas desde el archivo "users.txt".
    }

    // Método que carga los usuarios y contraseñas desde el archivo "users.txt".
    private void loadUsers() {
        try {
            Scanner scanner = new Scanner(new File("users.txt")); // Abre un Scanner para leer el archivo "users.txt".
            while (scanner.hasNextLine()) { // Mientras haya líneas por leer en el archivo:
                String line = scanner.nextLine(); // Lee la siguiente línea del archivo.
                String[] parts = line.split(":"); // Divide la línea en dos partes separadas por el caracter ":".
                users.put(parts[0], parts[1]); // Agrega un par clave-valor al mapa de usuarios y contraseñas.
            }
            scanner.close(); // Cierra el Scanner.
        } catch (IOException e) { // Si ocurre un error de entrada/salida:
            e.printStackTrace(); // Imprime el stack trace del error.
        }
    }

    // Método que verifica si un usuario y contraseña son válidos.
    public boolean isValidUser(String username, String password) {
        String storedPassword = users.get(username); // Obtiene la contraseña almacenada para el usuario especificado.
        return storedPassword != null && storedPassword.equals(password); // Compara la contraseña especificada con la almacenada y devuelve true si son iguales, o false en caso contrario.
    }

    // Método que agrega un nuevo usuario y contraseña.
    public boolean addUser(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Si el usuario ya existe, devuelve false.
        }
        users.put(username, password); // Agrega el nuevo usuario y contraseña al mapa.
        saveUsers(); // Guarda los usuarios y contraseñas actualizados en el archivo "users.txt".
        return true; // Devuelve true para indicar que el usuario fue agregado correctamente.
    }

    // Método que guarda los usuarios y contraseñas en el archivo "users.txt".
    private void saveUsers() {
        try {
            FileWriter writer = new FileWriter("users.txt"); // Abre un FileWriter para escribir en el archivo "users.txt".
            for (Map.Entry<String, String> entry : users.entrySet()) { // Por cada par clave-valor en el mapa de usuarios y contraseñas:
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n"); // Escribe una línea en el archivo con el formato "usuario:contraseña".
            }
            writer.close(); // Cierra el FileWriter.
        } catch
        (IOException e) { // Si ocurre un error de entrada/salida:
            e.printStackTrace(); // Imprime el stack trace del error.
            }
            }
// Método que muestra una ventana de diálogo para que el usuario inicie sesión.
public boolean showSignInPrompt() {
    String username = JOptionPane.showInputDialog("Ingrese su nombre de usuario"); // Muestra una ventana de diálogo para que el usuario ingrese su nombre de usuario.
    if (username == null) {
        return false; // Si el usuario cancela la operación, devuelve false.
    }
    String password = JOptionPane.showInputDialog("Ingrese su contraseña"); // Muestra una ventana de diálogo para que el usuario ingrese su contraseña.
    if (password == null) {
        return false; // Si el usuario cancela la operación, devuelve false.
    }
    if (isValidUser(username, password)) { // Si el usuario y la contraseña son válidos:
        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso"); // Muestra una ventana de diálogo informando al usuario que el inicio de sesión fue exitoso.
        return true; // Devuelve true para indicar que el inicio de sesión fue exitoso.
    } else { // Si el usuario o la contraseña son inválidos:
        JOptionPane.showMessageDialog(null, "Credenciales inválidas. Intente de nuevo."); // Muestra una ventana de diálogo informando al usuario que las credenciales son inválidas.
        return false; // Devuelve false para indicar que el inicio de sesión no fue exitoso.
    }
}

// Método que muestra una ventana de diálogo para que el usuario cree una nueva cuenta.
public void showSignUpPrompt() {
    String username = JOptionPane.showInputDialog("Ingrese un nombre de usuario"); // Muestra una ventana de diálogo para que el usuario ingrese un nombre de usuario.
    if (username == null) {
        return; // Si el usuario cancela la operación, no hace nada.
    }
    if (users.containsKey(username)) { // Si el usuario ya existe:
        JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe. Intente de nuevo."); // Muestra una ventana de diálogo informando al usuario que el nombre de usuario ya existe.
        return; // Sale del método sin hacer nada más.
    }
    String password = JOptionPane.showInputDialog("Ingrese una contraseña"); // Muestra una ventana de diálogo para que el usuario ingrese una contraseña.
    if (password == null) {
        return; // Si el usuario cancela la operación, no hace nada.
    }
    addUser(username, password); // Agrega el nuevo usuario y contraseña al mapa.
    JOptionPane.showMessageDialog(null, "Registro exitoso. Por favor inicie sesión."); // Muestra una ventana de diálogo informando al usuario que el registro fue exitoso y que debe iniciar sesión.
}
}