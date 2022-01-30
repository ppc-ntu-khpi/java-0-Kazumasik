public class Shirt {
  public int shirtID = 2; // стандартне значення номера моделі сорочки
  public String description = "text for description"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public char colorCode = 'U';
  public double price = 16.50; // стандартна вартість сорочки
  public int quantityInStock = 0; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    switch (colorCode) 
    {
      case 'R':
        System.out.println("Color: Red");
        break;
      case 'G':
        System.out.println("Color: Green");
        break;
      case 'B':
        System.out.println("Color: Blue");
        break;
      default:
        System.out.println("Color: default");
        break;
    }
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу