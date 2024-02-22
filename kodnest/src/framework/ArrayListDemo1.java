package framework;


	import java.util.ArrayList;

	public class ArrayListDemo1{
		public static void main(String[]args)
		{
			ArrayList UiList=new ArrayList();
			UiList.add("html");
			UiList.add("CSS");
			UiList.add("react");
			
			System.out.println("Ui list:"+UiList);
			System.out.println("Ui List size:"+UiList.size());
			ArrayList  LogicList=new ArrayList();
			LogicList.add("java");
			UiList.add("python");
			UiList.add("golang");
			System.out.println("Logic list:"+LogicList);
			System.out.println("Ui List size:"+LogicList.size());
			ArrayList fullStackList=new ArrayList();
			fullStackList.addAll(UiList);
			fullStackList.addAll(LogicList);
	
			
			
			System.out.println("fullStackList:"+fullStackList);
			System.out.println("fullStackList:"+fullStackList.size());
		}
	}
