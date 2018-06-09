package com.thinkinginjava.polymorphism;

import static com.thinkinginjava.tools.Tools.*;

class AlertStatus {
	void ShowStatus() {}
}

class ASRun extends AlertStatus{
	@Override
	void ShowStatus() {
		print("Starship Run.");
	}
}

class ASTurnLeft extends AlertStatus{
	@Override
	void ShowStatus() {
		print("Starship Turn Left.");
	}
}

class ASStop extends AlertStatus{
	@Override
	void ShowStatus() {
		print("Starship Stop.");
	}
}

public class Starship {
	private AlertStatus as = new AlertStatus();
	private ASRun asr =new ASRun();
	private ASTurnLeft astl = new ASTurnLeft();
	private ASStop ass =new ASStop();
	
	void Run() {as = asr; as.ShowStatus();}
	void TurnLeft() {as = astl; as.ShowStatus();}
	void Stop() {as = ass; as.ShowStatus();}
}
