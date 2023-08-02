package Day07.Ex05_BoardInterface;

public interface DataService {
	
	Text[] selectList();
	
	Text select(int no);
	
	int insert(Text text);
	
	int update(Text text);
	
	int delete(int no);

}
