package com.web.editor.model.recommend;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

public class ItemRecommend {

	// for문 돌려서 나온는 번호나 출력결과 리스트에 저장시켜서 리스트 번호에 맞는 코스들 보여주기
	public List<String> Recommend(int cosno) {
		List<String> Res = new ArrayList<>();
		try {

			DataModel dm = new FileDataModel(
					new File("C:/MySqlOutputData/test.csv"));

			// ItemSimilarity sim = new LogLikelihoodSimilarity(dm);

			TanimotoCoefficientSimilarity sim = new TanimotoCoefficientSimilarity(dm);

			GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(dm, sim);

			// x는 첫번째 아이템 값 (그냥 구분하려고 쓴듯)
			int x = 1;

			for (LongPrimitiveIterator items = dm.getItemIDs(); items.hasNext();) {

				long itemId = cosno;

				List<RecommendedItem> recommendations = recommender.mostSimilarItems(itemId, 5);

				for (RecommendedItem recommendation : recommendations) {

					System.out.println(itemId + "," + recommendation.getItemID() + "," + recommendation.getValue());
					Res.add(String.valueOf(recommendation.getItemID()));

				}

				x++;

				if (x > 1)
					break;

			}

		} catch (IOException e) {

			System.out.println("there was an error.");

			e.printStackTrace();

		} catch (TasteException e) {

			System.out.println("there was an Taste Exception.");

			e.printStackTrace();

		}
		return Res;

	}

}
