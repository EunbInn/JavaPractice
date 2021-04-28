package Lecture06;
//20210427 김은비 리모콘 메서드 클래스
public class TvRemocon {
	int k08_volum_limit_up;//최대볼륨 인티저 선언
	int k08_volum_limit_dn;//최소볼륨 인티저 선언
	int k08_volum;//인티저변수 선언
	String k08_help;//스트링 선언
	int k08_channel_limit_up;//최대채널 인티저 선언
	int k08_channel_limit_dn;//최소 채널 인티저 선언
	int k08_channel;//인티저변수 선언
	final int k08_channelVal = 1;//채널 선택 값 지정
	final int k08_volumVal = 2;//볼륨 선택값 지정
	
	public TvRemocon() {
		k08_volum_limit_up = 15;//최대 볼륨값 저장
		k08_volum_limit_dn = 0;//최소 볼륨값 저장
		k08_channel_limit_up = 30;//최대 채널값 저장
		k08_channel_limit_dn = 1;//최소 채널값 저장
	}
	
	public TvRemocon(int k08_volOrCh, int k08_choice) {
		k08_volum_limit_up = 15;//최대 볼륨값 저장
		k08_volum_limit_dn = 0;//최소 볼륨값 저장
		k08_channel_limit_up = 30;//최대 채널값 저장
		k08_channel_limit_dn = 1;//최소 채널값 저장
		k08_volum = k08_volOrCh;//입력 볼륨값 저장
		k08_channel = k08_volOrCh;//입력 볼륨값 저장
		if (k08_choice == k08_channelVal && k08_channel > 0) {//인자로 받아온 choice 변수 값이 1과 같고 채널변수값 >0 일때
			System.out.printf("채널입력[CH%d]\n", k08_channel);//현재 입력받은 값 출력
			for (int i = 0; i < 10; i++) {//0~9 반복문 실행
				k08_ChannelUp();//채널업 메소드 호출하여 실행
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
			for (int i = 0; i < 10; i++) {//0~9 반복문 실행
				k08_ChannelDn();//채널다운 메소드 호출하여 실행		
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
		} else if (k08_choice == k08_channelVal && k08_channel < 0) {//인자로 받아온 choice 변수 값이 1과 같고 채널변수값 <0 일때
			System.out.printf("채널입력[CH%d]\n", k08_channel);//현재 입력받은 값 출력
			k08_channel *= -1;//변수에 -1을 곱한 값으로 연산
			for (int i = 0; i < 10; i++) {//0~9 반복문 실행
				k08_ChannelUp();//채널업 메소드 호출하여 실행
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
			for (int i = 0; i < 10; i++) {//0~9 반복문 실행
				k08_ChannelDn();//채널다운 메소드 호출하여 실행			
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
		} else if (k08_choice == k08_volumVal && k08_volum > 0) {//인자로 받아온 choice 변수 값이 2와 같고 볼륨변수값 >0 일때
			System.out.printf("현재볼륨[Vol%d]\n", k08_volum);//현재 입력받은 값 출력
			for (int i = 0; i < 5; i++) {//0~4 반복문 실행
				k08_VolUp();//볼륨업 메소드 호출하여 실행
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
			for (int i = 0; i < 5; i++) {//0~4 반복문 실행
				k08_VolDn();//볼륨다운 메소드 호출하여 실행
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
		} else if (k08_choice == k08_volumVal && k08_volum < 0) {//인자로 받아온 choice 변수 값이 2와 같고 채널변수값 <0 일때
			System.out.printf("현재볼륨[Vol%d]\n", k08_volum);//현재 입력받은 값 출력
			k08_volum *= -1;//변수에 -1을 곱한 값으로 연산
			for (int i = 0; i < 5; i++) {//0~4 반복문 실행
				k08_VolUp();//볼륨다운 메소드 호출하여 실행
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
			for (int i = 0; i < 5; i++) {//0~4 반복문 실행
				k08_VolDn();
			}
			System.out.printf("[%s]\n",k08_help);//결과값 출력
		}
	}
	
	void k08_VolUp() {//볼륨업 메서드 선언
		if (k08_volum == k08_volum_limit_up) { //볼륨 변수 값이 최대볼륨값과 동일하다면
			k08_help = "최대 크기 입니다.";//스트링에 해당 문자열 저장
		} else {//그게 아니라면
			k08_volum++;// + 1
			k08_help = String.format("Vol %d", k08_volum);//스트링에 해당 문자열 저장
		}
	}
	
	void k08_VolDn() {//볼륨다운 메서드 선언
		if (k08_volum == k08_volum_limit_dn) { //볼륨 변수 값이 최소볼륨값과 동일하다면
			k08_help = "볼륨을 더 줄일 수 없습니다.";//스트링에 해당 문자열 저장
		} else {//그게 아니라면
			k08_volum--;// - 1
			k08_help = String.format("Vol %d", k08_volum);//스트링에 해당 문자열 저장
		}
		
	}
	
	void k08_ChannelUp() {//채널업 메서드 선언
		if (k08_channel == k08_channel_limit_up) { //채널 변수 값이 최대채널값과 동일하다면
			k08_help = "더 이상 채널이 존재하지 않습니다.";//스트링에 해당 문자열 저장
		} else {//그게 아니라면
			k08_channel++;// + 1
			k08_help = String.format("CH %d", k08_channel);//스트링에 해당 문자열 저장
		}
		
	}
	
	void k08_ChannelDn() {//채널다운 메서드 선언
		if (k08_channel == k08_channel_limit_dn) { //채널 변수 값이 최소채널값과 동일하다면
			k08_help = "더 이상 채널이 존재하지 않습니다.";//스트링에 해당 문자열 저장
		} else {//그게 아니라면
			k08_channel--;// - 1
			k08_help = String.format("CH %d", k08_channel);//스트링에 해당 문자열 저장
		}
	}
}
