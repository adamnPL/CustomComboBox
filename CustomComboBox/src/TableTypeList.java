import java.util.ArrayList;
import java.util.List;

public class TableTypeList {

	List<TableType> TableTypeList = new ArrayList<TableType>();

	public TableTypeList() {
		TableTypeList.add(new TableType("A", " name type A"));
		TableTypeList.add(new TableType("B", " name type B"));
		TableTypeList.add(new TableType("C", " name type C"));
		TableTypeList.add(new TableType("D", " name type D"));

	}

	public Object[] getCurrencyTabList() {
		return TableTypeList.toArray();
	}

}
