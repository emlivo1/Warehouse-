package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nrs20.skladiste.Product;
import nrs20.skladiste.ProductsModel;

public class ProductsController {
    private ProductsModel model;
    public TableView listOfProducts;
    public TableColumn nazivCol;
    public TableColumn sifraCol;
    public TableColumn kategorijaCol;
    public TableColumn kolicinaCol;
    public ProductsController(ProductsModel model) {

        this.model = model;
    }

    @FXML
    public void initialize() {
        nazivCol.setCellFactory(new PropertyValueFactory<Product, String>("naziv"));
        sifraCol.setCellFactory(new PropertyValueFactory<Product, String>("sifra"));
        kategorijaCol.setCellFactory(new PropertyValueFactory<Product, String>("kategorija"));
        kolicinaCol.setCellFactory(new PropertyValueFactory<Product, String>("kolicina"));
        listOfProducts.setItems(model.getProducts());
    }

    public void obrisiProizvod(ActionEvent actionEvent) {
    }

    public void urediProizvod(ActionEvent actionEvent) {
    }

    public void dodajProizvod(ActionEvent actionEvent) {
    }
}