package npu.person;

public class Std {

	public  Std() {
		
	}
	public Std(String _StdNo, String _StdName, String _StdGender) {
		this.set_StdNo(_StdNo);
		this.set_StdName(_StdName);
		this.set_StdGender(_StdGender);
	}
	
	public String get_StdName() {
		return _StdName;
	}
	public void set_StdName(String _StdName) {
		this._StdName = _StdName;
	}
	public String get_StdGender() {
		return _StdGender;
	}
	public void set_StdGender(String _StdGender) {
		this._StdGender = _StdGender;
	}
	public String get_StdNo() {
		return _StdNo;
	}
	public void set_StdNo(String _StdNo) {
		this._StdNo = _StdNo;
	}


	private String _StdNo;
	private String _StdName;
	private String _StdGender;
	
	@Override
	public String toString() {
		return "學生學號=" + _StdNo + ",學生姓名=" + _StdName + ",學生性別=" + _StdGender ;
	}
	
	
	
}
