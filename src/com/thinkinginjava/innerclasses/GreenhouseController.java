package com.thinkinginjava.innerclasses;

/*
 * Exercise 24: (2) In GreenhouseControls.java, add Event inner classes that turn fans on and off. 
 * Configure GreenhouseController.java to use these new Event objects.
 */
/*
 * Exercise 25: (3) Inherit from GreenhouseControls in GreenhouseControls.java to add Event inner classes that turn water mist generators on and off. 
 * Write a new version of GreenhouseController.java to use these new Event objects.
 */

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			//Ex24 --s
			gc.new FanOn(700),
			gc.new FanOff(900),
			//Ex24 --e
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)
			gc.addEvent(
					new GreenhouseControls.Terminate(
							new Integer(args[0])));
		gc.run();
	}
	//Ex25 --s
	public static void mainEx25(String[] args) {
		GreenhouseControlsEx25 gc = new GreenhouseControlsEx25();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new WaterMistGeneratorsOn(200),
			gc.new WaterMistGeneratorsOff(400),
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)
			gc.addEvent(
					new GreenhouseControls.Terminate(
							new Integer(args[0])));
		gc.run();
	}
	//Ex25 --e
}