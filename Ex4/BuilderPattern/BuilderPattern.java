package BuilderPattern;

public class BuilderPattern {
	public static void main(String[] args) {
		
		Computer mycomputer = new Computer.BuildComputer().setMotherBoard("intel...mb").setRam("800gb ram")
				.setHarddisk("1000 tb").setSsd("20million tb ssd hd").build();
        System.out.println();
		System.out.println(mycomputer);
	}
}