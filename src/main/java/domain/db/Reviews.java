package domain.db;
import java.util.ArrayList;

import domain.model.Address;
import domain.model.Review;
public class Reviews {

		private static Reviews instance = null;
		private ArrayList<Review> reviewlist = new ArrayList<Review>();
		protected Reviews() {
			Review rv1 = new Review("Mr Anderson",3,"Not too bad", new Address("Best Hotel","Leuven","Vlaams-Brabant", "Belgium", "3000", "Brusselsestraat", "15"));
			reviewlist.add(rv1);
		}
		public static Reviews getInstance() {
			if (instance == null) {
				instance = new Reviews();
			}
			return instance;
		}
		
		public void addReview(Review d) {
			if (d == null) throw new IllegalArgumentException("Destination cannot be null");
			reviewlist.add(d);
		}
		
		public void removeReview(Review d) {
			if (d == null) throw new IllegalArgumentException("Destination cannot be null");
			for(Review e : reviewlist) {
				if (e.equals(d)) {
					reviewlist.remove(e);
				}
			}
		}
		
		public ArrayList<Review> getReviewsForDestinationWithName(String name) {
			if (name == null || name.trim().isEmpty()) {
				throw new IllegalArgumentException();
			}
			ArrayList<Review> reviewsforname = new ArrayList<Review>();
			for (Review e : reviewlist) {
				if (e.getLocation().getName().trim().toLowerCase().replaceAll("\\s", "").equals(name.trim().toLowerCase().replaceAll("\\s", ""))) {
					reviewsforname.add(e);
				}
			}
			return reviewsforname;
		}
	}

