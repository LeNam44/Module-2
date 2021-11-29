package IOBinaryFileandSerialization.ProductManage.management.product;

import IOBinaryFileandSerialization.ProductManage.management.IGeneralManagement;
import IOBinaryFileandSerialization.ProductManage.model.Product;

import java.util.List;

public interface IProductManagement extends IGeneralManagement<Product> {

    void readFile();

    void writeToFile();
}
