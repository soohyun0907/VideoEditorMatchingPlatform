package com.web.editor.model.recommend;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class UserRecommend {

	public static void main(String[] args) throws IOException, TasteException {
		
		DataModel model = new FileDataModel(new File("C:/Users/multicampus/Desktop/pjt3_2/pjt3/backend/src/main/resources/data/movies.csv"));


		UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

		UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);

		UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

		//2번의 사용자에게 1개의 제품 추천
		List<RecommendedItem> recommendations = recommender.recommend(2, 1);
		for(RecommendedItem recommendedation: recommendations){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!1");
			System.out.println(recommendedation);
		} 
	}

}
