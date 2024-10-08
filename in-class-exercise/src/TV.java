
public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;
	
	public TV() {
		
	}
	
	public TV(int channel, int volumeLevel, boolean on) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int newChannel) {
		this.channel = newChannel;
	}
	
	public int getVolume() {
		return volumeLevel;
	}
	
	public void setVolume(int newVolumeLevel) {
		this.volumeLevel = newVolumeLevel;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + "]";
	}
	

	
}
