package com.jaswine.core.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * token生成&验证
 *
 * @author Jasmine
 */
public class Jwtoken {

	private static final String SECRET = "JwtToken";
	private static final String USER = "JAVA_WEB";
	private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);
	private static final String MATURITYERROR = "token已过期";


	/**
	 * 生成token
	 *
	 * @return token token字符串
	 */
	public static String createToken() {
		String token = "";
		try {
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("alg","HS256");
//			map.put("typ","JWT");
			token = JWT.create()
					.withIssuer(token)
//					.withHeader(map)
					.withIssuedAt(new Date())
//					.withExpiresAt(expirsesDate)
					.sign(ALGORITHM);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return token;
	}


	/**
	 * 验证token
	 *
	 * @param token token字符串
	 * @return 验证信息
	 */
	public static String verifyToken(String token) {
		String res = "";
		DecodedJWT jwt = null;
		try {
			JWTVerifier verifier = JWT.require(ALGORITHM).build();
			jwt = verifier.verify(token);
			if (jwt.getExpiresAt() != null && jwt.getExpiresAt().getTime() < new Date().getTime()) {
				res = MATURITYERROR;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
