package oop.exercises.on_oop.discount_system;

    public class TestClass {
        public static void main(String[] args) {
            // 1. Mijozni yaratish
            Customer customer1 = new Customer("Alice");
            customer1.setMember(true);
            customer1.setMemberType("Gold");

            // 2. Tashrif va xizmat/mahsulot xarajatlarini qo'shish
            Visit visit1 = new Visit(customer1);
            visit1.setServiceExpense(200); // Xizmatlar uchun $200
            visit1.setProductExpense(100); // Mahsulotlar uchun $100

            // 3. Natijani chop etish
            System.out.println(visit1);
            System.out.println("Umumiy xarajat (diskontdan keyin): $" + visit1.getTotalExpense());

            // 4. Yana bir mijozni sinash
            Customer customer2 = new Customer("Bob");
            customer2.setMember(false); // A'zolik yo'q

            Visit visit2 = new Visit(customer2);
            visit2.setServiceExpense(150);
            visit2.setProductExpense(80);

            System.out.println(visit2);
            System.out.println("Umumiy xarajat (diskontdan keyin): $" + visit2.getTotalExpense());
        }
    }

