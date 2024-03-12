# Fish-Aquarium-Management-System 🐠🏞️🛒

In this system, there are two GUI interfaces: one for internal fish inventory management and the other for customer-side fish ordering. Both interfaces are developed using Java Swing and utilize data structures and algorithms.

## Fish Inventory Management UI 📋🐟

The fish inventory management UI offers functions such as adding, deleting, and updating fish entries, all of which are reflected in a JTable. Additionally, the UI provides sorting capabilities for fish species name, fish size, and fish price, allowing users to arrange entries from minimum to maximum or vice versa.

## Customer-Side Fish Ordering Interface 🛒🐠

On the customer-side fish ordering interface, users can purchase fish of their choice and the system calculates the total cost, subtotal, and tax based on the fish order. Additionally, there is a button labeled 'Order History,' which, when clicked, displays a separate GUI called 'Order History.' This GUI contains a JTable that showcases automatically generated purchase IDs, order IDs, and total costs.

## Data Structures and Algorithms 🧠🔍

- **Internal Fish Inventory Management:** A singly linked list data structure is employed along with the merge sort algorithm for efficient sorting.
  
- **Order History Management:** For managing order history in a FIFO (First In, First Out) concept, a circular queue data structure is utilized.
