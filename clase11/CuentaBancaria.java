public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin nombre";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    // Constructor parametrizado
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (titular == null || titular.trim().isEmpty()) {
            this.titular = "Sin nombre";
        } else {
            this.titular = titular;
        }

        if (numeroCuenta == null || numeroCuenta.length() < 6) {
            this.numeroCuenta = "000000";
        } else {
            this.numeroCuenta = numeroCuenta;
        }

        // CORREGIDO: saldo no puede ser negativo
        if (saldo < 0) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }

    // Método depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor que 0.");
        }
    }

    // Método retirar 
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor que 0.");
        } else if (monto > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Titular: " + titular + 
               "\nNúmero de cuenta: " + numeroCuenta +
               "\nSaldo: $" + String.format("%.2f", saldo);
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        System.out.println("=== Cuenta creada por defecto ===");
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println(cuenta1);

        System.out.println("\n=== Cuenta creada con parámetros ===");
        CuentaBancaria cuenta2 = new CuentaBancaria("sian valencia", "123456", 1000);
        System.out.println(cuenta2);

        System.out.println("\n--- Operaciones ---");
        cuenta2.depositar(500);
        cuenta2.retirar(300);
        cuenta2.retirar(1500); // probar retiro mayor que el saldo
        cuenta2.depositar(-200); // probar depósito inválido

        System.out.println("\n=== Estado final de la cuenta ===");
        System.out.println(cuenta2);
    }
}