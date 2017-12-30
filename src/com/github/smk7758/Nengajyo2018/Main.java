package com.github.smk7758.Nengajyo2018;

import java.time.LocalDateTime;

public class Main {
	/**
	 * License: 作成者の許可なくとも改変および再配布可能とする。 ただし日本国内においてのみとし、作成者はこのプログラムに関する一切の責任を持たない。
	 *
	 * @author smk7758
	 */
	private static boolean debug_mode = false;

	public static void main(String[] args) {
		if (args.length > 0 && args[0].equals("--debug")) debug_mode = true;
		LocalDateTime time_start = LocalDateTime.now();
		LocalDateTime time_gantan = LocalDateTime.of(2018, 1, 1, 0, 0);
		if (time_start.isBefore(time_gantan)) {
			System.out.println("まだあけません…。");
		} else if (time_start.isAfter(time_gantan)) {
			System.out.println("あけましておめでとうございます！");
		} else if (time_start.isEqual(time_gantan)) {
			System.out.println("時空の狭間！？");
		} else {
			System.err.println("It is neither old year nor new year. Where am I? What's happening to me!?");
		}
		printDebug(time_start.toString());
	}

	private static void printDebug(String text) {
		if (debug_mode) System.out.println(text);
	}
}
