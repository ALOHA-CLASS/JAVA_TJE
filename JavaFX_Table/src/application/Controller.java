package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {

	@FXML
	public TableView<Product> tableView;
	@FXML
	public TableColumn<Product, String> colName;
	@FXML
	public TableColumn<Product, Double> colPrice;
	@FXML
	public TableColumn<Product, Integer> colQuantity;
	
	ObservableList<Product> observableList = FXCollections.observableArrayList(
			new Product("item1", 24.1, 0),
			new Product("item2", 50.1, 10)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		colName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
		colPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice"));
		colQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity"));
		tableView.setItems(observableList);
	}
	
	
	
	
	
	
	
	
	

}
