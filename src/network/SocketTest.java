package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class SocketTest {

	public static void main(String[] args) throws Exception {

		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		InetAddress address2 = InetAddress.getByName("DESKTOP-OIPDSE4");
		System.out.println(address2.getHostAddress());
		URL url = new URL("http://www.baidu.com");
		System.out.println("请求协议：" + url.getProtocol() + ",文件名：" + url.getFile() + ",查询字符串：" + url.getQuery() + ",端口："
				+ url.getPort() + ",主机：" + url.getHost());

		// 使用URL读取网页内容
		// 创建一个URL实例
		URL url1 = new URL("http://www.baidu.com");
		InputStream is = url1.openStream();// 通过openStream方法获取资源的字节输入流
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");// 将字节输入流转换为字符输入流,如果不指定编码，中文可能会出现乱码
		BufferedReader br = new BufferedReader(isr);// 为字符输入流添加缓冲，提高读取效率
		String data = br.readLine();// 读取数据
		while (data != null) {
			System.out.println(data);// 输出数据
			data = br.readLine();
		}
		br.close();
		isr.close();
		is.close();
	}

}
