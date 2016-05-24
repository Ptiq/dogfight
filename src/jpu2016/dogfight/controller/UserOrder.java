package jpu2016.dogfight.controller;

public abstract class UserOrder implements IUserOrder {
	private Order order;
	private int player;

	public UserOrder(final int player, final Order order) {

	}

	public Order getOrder() {
		return this.order;
	}

	public int getPlayer() {
		return this.player;
	}
}
