package IOBinaryFileandSerialization.ProductManage.management.category;

import IOBinaryFileandSerialization.ProductManage.management.IGeneralManagement;
import IOBinaryFileandSerialization.ProductManage.model.Category;

public interface ICategoryManagement extends IGeneralManagement<Category> {
    void writeToFile();
}
