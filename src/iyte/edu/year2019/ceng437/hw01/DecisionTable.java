package iyte.edu.year2019.ceng437.hw01;

public class DecisionTable {

	public DecisionTable() { 

	}

	public double calculateShipmentCost(Shipment shipment) { 
		DeliveryDay deliveryDay = shipment.getDeliveryDay();
		int numberOfItems = shipment.getNumberOfItems();
		int purchaseAmount = shipment.getPurchaseAmount();

		double cost = 0;
		if(purchaseAmount <= 150) {
			if(numberOfItems <= 4) { 
				switch(deliveryDay) {
				case NEXT_DAY:
					cost = 35;
					break;
				case IN_TWO_DAYS:
					cost = 20;
					break;
				case IN_A_WEEK:
					cost = numberOfItems * 2.00;
					break;
				default:
					cost = numberOfItems * 2.00;
					break;
				}
			} else {
				switch(deliveryDay) {
				case NEXT_DAY:
					cost = numberOfItems * 5.00;
					break;
				case IN_TWO_DAYS:
					cost = numberOfItems * 3.50;
					break;
				case IN_A_WEEK:
					cost = numberOfItems * 1.50;
					break;
				default:
					cost = numberOfItems * 1.50;
					break;
				}
			}
		} else { /* purchaseAmount > 150 */
			if(numberOfItems <= 4) { 
				switch(deliveryDay) {
				case NEXT_DAY:
					cost = 40;
					break;
				case IN_TWO_DAYS:
					cost = 25;
					break;
				case IN_A_WEEK:
					cost = 20;
					break;
				default:
					cost = 20;
					break;
				}
			} else {
				switch(deliveryDay) {
				case NEXT_DAY:
					cost = numberOfItems * 9.00;
					break;
				case IN_TWO_DAYS:
					cost = numberOfItems * 7.50;
					break;
				case IN_A_WEEK:
					cost = numberOfItems * 3.50;
					break;
				default:
					cost = numberOfItems * 3.50;
					break;
				}
			}
		}
		return cost;
	}
}


