package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.DTO.Board;
import application.service.BoardService;
import application.service.BoardServiceImpl;
import application.util.SceneUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class Controller implements Initializable {
	
	@FXML
	private TableView<Board> boardTableView;
	
	@FXML
    private TableColumn<Board, Integer> colBoardNo;
	@FXML
	private TableColumn<Board, String> colTitle;
	@FXML
	private TableColumn<Board, String> colWriter;
	@FXML
	private TableColumn<Board, String> colRegDate;
    @FXML
    private TableColumn<Board, String> colUpdDate;
	
    BoardService boardService = new BoardServiceImpl();
    
    Stage stage;
    Scene scene;
    Parent root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/* 데이터 초기화 */
		List<Board> boardList = new ArrayList<Board>();
		
		boardList = boardService.list();
//		Board board1 = new Board(1,"제목1","작성자1","내용1","2023-08-18","2023-08-18");
//		Board board2 = new Board(2,"제목2","작성자2","내용2","2023-08-18","2023-08-18");
//		Board board3 = new Board(3,"제목3","작성자3","내용3","2023-08-18","2023-08-18");
//		boardList.add(board1);
//		boardList.add(board2);
//		boardList.add(board3);
		
		ObservableList<Board> list = FXCollections.observableArrayList(
//			board1, board2, board3
				boardList
		);
		// TablveColumn 에 열과 추가할 아이템 객체의 게터 이름 지정하기
		// - setCellValueFactory() : 셀의 값을 지정하는 메소드
		// - new PropertyValueFactory("게터이름")
		// * 게터이름 : get을 제외한 게터 메소드의 이름
		// ex) getBoardNo  -->  BoardNo
		// ※ module-info.java  --> java.base 모듈 추가
		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("BoardNo"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
		colUpdDate.setCellValueFactory(new PropertyValueFactory<>("UpdDate"));
		
		// TableView 에 데이터 리스트를 지정
		// - 미리 매핑된 TableColumn 에 리스트의 요소 객체의 변수값이 지정됨 
		boardTableView.setItems(list);
		
		/* 이벤트 처리 */
		// 더블클릭 이벤트
		boardTableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// 더블 클릭
				if( event.getClickCount() == 2 && boardTableView.getSelectionModel().getSelectedItem() != null ) {
					int boardNo = boardTableView.getSelectionModel().getSelectedItem().getBoardNo();
					try {
						ReadController readController = (ReadController) SceneUtil.getInstance().getController(UI.READ.getPath());
						readController.read(boardNo);
						Parent root = SceneUtil.getInstance().getRoot(); 
						SceneUtil.getInstance().switchScene(event, UI.READ.getPath(), root);
					} catch (IOException e) {
						System.err.println("[목록->읽기] 화면 이동 중 예외 발생..");
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	
	// 글쓰기 화면으로 이동
	public void moveToInsert(ActionEvent event) throws IOException {
		System.out.println("글쓰기 화면...");
//		Parent root = FXMLLoader.load(getClass().getResource(fxml));
//		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
		
//		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
//		root = loader.load();  // Sub 씬 가져옴
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
		SceneUtil.getInstance().switchScene(event, UI.INSERT.getPath());
	
	}


	// 프로그램 종료하기
	public void close(ActionEvent event) {
		SceneUtil.getInstance().close(event);
	}
	

}














