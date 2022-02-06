package ronancamargo.util

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Path, Paths}
import scala.jdk.CollectionConverters._
import scala.util.chaining._

object FileManager {
  def readJson(json: String): String = filePath(s"$json.json") pipe readFile

  def filePath(fileName: String): Path = Paths.get(s"src/main/resources/$fileName")
  def readFile(path: Path): String     = Files.readAllLines(path, StandardCharsets.UTF_8).asScala.toList.mkString
}
