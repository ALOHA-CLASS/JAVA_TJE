package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
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
	private TableView<Board> boardTableView;
	
	
	@FXML
	public TableColumn<Board, Integer> colBoardNo;
	@FXML
	public TableColumn<Board, String> colTitle;
	@FXML
	public TableColumn<Board, String> colWriter;
	@FXML
	public TableColumn<Board, String> colRegDate;
	@FXML
	public TableColumn<Board, String> colUpdDate;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("boardNo"));
//		colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
//		colWriter.setCellValueFactory(new PropertyValueFactory<>("writer"));
//		colRegDate.setCellValueFactory(new PropertyValueFactory<>("regDate"));
//		colUpdDate.setCellValueFactory(new PropertyValueFactory<>("updDate"));
		
		Board board1 = new Board("제목1", "작성자1", "내용1");
		Board board2 = new Board("제목2", "작성자2", "내용2");
		Board board3 = new Board("제목3", "작성자3", "내용3");
	
		ArrayList<Board> boardList = new ArrayList<Board>();
		boardList.add(board1);
		boardList.add(board2);
		boardList.add(board3);
		
		ObservableList<Board> list = FXCollections.observableArrayList(
		new Board("제목1", "작성자1", "내용1"),
		new Board("제목1", "작성자1", "내용1"),
		new Board("제목1", "작성자1", "내용1")
//				boardList
		);
		
		boardTableView.setItems(list);
	}

	
	
	

}
