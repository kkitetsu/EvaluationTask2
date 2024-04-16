# EvaluationTask2

修正点：
InputCheck.java の コンストラクター内の str = str を this.str = str に変更

改善・疑問点：
1. InputCheck.java のメソッド checkSize は boolean を返しているので、関数名としては isValidSize などが相応しいと思う。
2. createFile.java の11行目の file.delete() が気になる。ファイルをインスタンス化した後でなぜ delete を呼び出しているのかよくわからない。特に目立ったバグは起きていないので放置。
3. 1024 のハードコードが目立つので、FINAL INT RATIO などの定数に保存するのもいいと思う。

