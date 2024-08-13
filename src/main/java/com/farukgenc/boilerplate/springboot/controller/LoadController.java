package com.farukgenc.boilerplate.springboot.controller;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farukgenc.boilerplate.springboot.security.dto.LoadRequest;
import com.farukgenc.boilerplate.springboot.security.dto.LoadResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
@Slf4j
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/load")
public class LoadController {

	// private final JwtTokenService jwtTokenService;
	/*
	private final String someField;

	LoadController(){

		someField = "asdsad";
	}*/

	@PostMapping
	public ResponseEntity<LoadResponse> loadRequest(@Valid @RequestBody LoadRequest loadRequest) {

		// virtual thread
		ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();

		// final LoginResponse loginResponse = jwtTokenService.getLoginResponse(loadRequest);
		// var pro = new Thread(new Some());

		var pro = new Thread(new Runnable() {
			public void run(){
				// LockSupport.parkNanos(3_000);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				var dt = new Date();
				log.info("In thr now! 3 sec is now over at " + dt.toString());
				// System.out.println("In thr now! 3 sec is now over at " + dt.toString());
			}
		});

		// make this daemon thread?
		// pro.setDaemon(true);

		if(pro.isDaemon())
		 log.info("Thr is daemon");
		else
		 log.info("Thr is not daemon!");

		pro.start();

		/*
		Future<String> res = service.submit(() -> {
			// LockSupport.parkUntil(1_000_000_000);
			try {
				Thread.sleep(3000);
				var dt = new Date();
				log.info("In future - 3 sec is now over at " + dt.toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// .parkNanos(1_000_000_000);
			var dt = new Date();
			log.info("3 sec is now over at " + dt.toString());
			return "";
		});

		int radius = -3;

		// try catch Future
		long actual = CompletableFuture
      .supplyAsync(() -> {
          if (radius <= 0) {
              throw new IllegalArgumentException("Supplied with non-positive radius '%d'");
          }
          return Math.round(Math.pow(radius, 2) * Math.PI);
      })
      .handle((result, ex) -> {
          if (ex == null) {
              return result;
          } else {
              return -1L;
          }
      })
      .get();

      System.out.println("Result = " + actual);

		// Thread.ofVirtual().start(() -> {
    // Some work
		// });

		// this is blocking
		// service.close();
		FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>(){
			public String call() throws InterruptedException{
				Thread.sleep(3_000);
				var dt = new Date();
				log.info("In future task - 3 sec is now over at " + dt.toString());
				return "str";
				// return null;
			}
		});

		// var list = new List<String>();
		service.execute(futureTask);

		List lst = new ArrayList<>();
		lst.add(new Object());*/

		var dt = new Date();
		return ResponseEntity.ok(new LoadResponse(dt.toString()));
	}
}

@Slf4j
class Some implements Runnable {
	public void run(){
		try {
			Thread.sleep(3000);
			// LockSupport.parkNanos(1_000_000_000);
			var dt = new Date();
			log.info("3 sec is now over at " + dt.toString());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
