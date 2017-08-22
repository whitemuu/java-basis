package me.nichijou.exception;

/**
 * Created by nichijou on 8/21/17.
 */
public class TryReturn {
	int method(){
		try {
			return 1;
		}catch (Exception e){
			return 2;
		}
	}
}
