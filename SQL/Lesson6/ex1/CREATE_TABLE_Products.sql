CREATE TABLE Products(
--COLUMN NAME COLUMN TYPE OPTIONAL PARAMS
ProductID INT,
CONSTRAINT Products_ID PRIMARY KEY (ProductID),
SupplierID NUMBER(10),
CONSTRAINT Products_FK FOREIGN KEY (SupplierID) REFERENCES Suppliers (SupplierID),
CategoryID NUMBER(10),
CONSTRAINT Categories_FK FOREIGN KEY (CategoryID) REFERENCES Categories (CategoryID),
QuantityPerUnit NUMBER(10),
UnitPrice FLOAT,
UnitsInStock NUMBER(5),
UnitsOnOrder NUMBER(10),
RecorderLevel NUMBER(4),
Discountinued  CHAR(1) CHECK (Discountinued IN ('N','Y'))
);