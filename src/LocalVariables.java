/**
 * Created by nichijou on 8/14/17.
 */
public class LocalVariables {
	void lvs(int i) {
		short m = 1;  //TODO 既然short被当成int处理，short存在还有何意义？另外反编译之后还是short，写在了class的哪里？这里我只能看出全是int的命令
		int j = 2;
		long k;
		k = 3;
		int l = 4;
	}
}
