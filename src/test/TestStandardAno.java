package test;

import java.util.ArrayList;
import java.util.List;

public class TestStandardAno {
		
		@Override
		public String toString(){
			return "Annotation exam";
		}
		
		@Deprecated
		public void Prn_Message(){
			System.out.println("����õ �̿���");
		}
		
		@SuppressWarnings({"rawtypes","unused"})
		public static void main(String[] args){
			List List_ar = new ArrayList();
		}
		
		

}
