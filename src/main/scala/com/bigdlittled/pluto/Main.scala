package com.bigdlittled.pluto

import zhttp.http._
import zhttp.service.Server
import zio._
import java.util.UUID
import zio.json._

object HelloWorld extends App {

  // Create HTTP route
  val app: HttpApp[Any, Nothing] = Http.collect[Request] {
    case Method.GET -> !! / "text" => Response.text("Hello World!")
    case Method.GET -> !! / "json" => Response.jsonString("""{"greetings": "Hello World!"}""")
  //  case Method.GET -> !! / "asset" => Response.jsonString(Asset("ETH").)
  }

  // Run it like any simple app
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    Server.start(8090, app.silent).exitCode
}