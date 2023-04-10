SELECT * FROM customers;


SELECT * FROM orders;


SELECT customerNumber customerName FROM customers;


SELECT orderNumber, customerNumber, orderDate FROM orders;


SELECT customerNumber, customerName
FROM customers
WHERE customerNumber=103;


SELECT orderNumber, customerNumber, orderDate
FROM orders
WHERE customerNumber = 103;


SELECT customers.customerNumber, customers.customerName, orders.orderNumber, orders.customerNumber, orders.orderDate
FROM customers, orders
WHERE customers.customerNumber=103 AND orders.customerNumber = 103;


SELECT c.customerNumber, c.customerName, o.orderNumber, o.customerNumber, o.orderDate
FROM customers AS c, orders AS o
WHERE c.customerNumber=103 AND o.customerNumber = 103;


SELECT c.customerNumber, c.customerName, o.orderNumber, o.customerNumber, o.orderDate
FROM customers c, orders o
WHERE c.customerNumber=103 AND o.customerNumber = 103;


SELECT c.customerNumber, c.customerName, o.orderNumber, o.customerNumber, o.orderDate
FROM customers c
INNER JOIN orders o ON c.customerNumber=o.customerNumber;


SELECT c.customerNumber, c.customerName, o.orderNumber, o.customerNumber, o.orderDate
FROM customers c
LEFT JOIN orders o ON c.customerNumber=o.customerNumber;


SELECT c.customerNumber, c.customerName, o.orderNumber, o.customerNumber, o.orderDate
FROM customers c
RIGHT JOIN orders o ON c.customerNumber=o.customerNumber;


SELECT c.customerNumber, c.customerName, o.orderNumber, o.customerNumber, o.orderDate, p.paymentDate, p.amount
FROM ((customers c INNER JOIN orders o ON c.customerNumber=o.customerNumber)
INNER JOIN payments p ON c.customerNumber=p.customerNumber);