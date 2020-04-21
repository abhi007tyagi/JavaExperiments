package tyagiabhinav.random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iFrame_Replace {

	public static void main(String[] args) {

		String str = "<p>Prescription orders can be tracked from the <a href=\"/wps/myportal/ORDER_STATUS\"> View Order Status</a> page. When you select \"Track Shipment,\" a new window will open. Select \"yes\" to continue to the tracking website. Once the page opens, you will see the progress of your package and the expected delivery date.</p><p><iframe width= \"100%\" height= \"100%\"src= \"https://www.youtube.com/embed/xy_k3bQ5Dgo\"></iframe></p>";
		try {
			Matcher matcher1 = Pattern.compile("<iframe(.+)</iframe>").matcher(str);
			if(matcher1.find()){
				Matcher matcher2 = Pattern.compile("src=(.*?)>").matcher(matcher1.group(1));
				if(matcher2.find()){
					String replaceStr = "<a href="+matcher2.group(1)+">";
					str = str.replaceAll("<iframe(.+)</iframe>", replaceStr);
				}
			}
			System.out.println(str);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

}
