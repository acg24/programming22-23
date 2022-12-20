package Unit4.EXERCISESIII.Exercise1.orders;
import Unit4.EXERCISESIII.Exercise1.items.Item;
public class Order {


    public class Order {
        private Client client;
        private int orderNumber;
        private Item item;

        public Order(Client client, int orderNumber, Item item) {
            this.client = client;
            this.orderNumber = orderNumber;
            this.item = item;
        }

        public Client getClient() {
            return client;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public Item getItem() {
            return item;
        }

        public void show() {
            System.out.println("Order number: " + orderNumber);
            System.out.println("Client: " + client.getName());
            item.show();
        }
}
