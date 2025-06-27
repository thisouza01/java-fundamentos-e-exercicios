import java.math.BigDecimal;

public class User {

    public static class Usuario {
        // Class attributes
        private long id;
        private String name;
        private BigDecimal amount;

        // constructor
        public Usuario(long id, String name, BigDecimal amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        // Getters
        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        // Setters
        public void setId(long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

    }

    public static void main(String[] args){
        Usuario user = new Usuario(1, "Thiago", new BigDecimal(1000));
        System.out.println("Usuário: " + user.getName() + ", Saldo: " + user.getAmount() );
    }
}
