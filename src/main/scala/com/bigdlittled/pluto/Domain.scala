package com.bigdlittled.pluto

final case class Asset(name: String)

final case class Market(buy: Asset, sell: Asset)

final case class Order(market: Market, amount: Int)

final case class Trade(order: Order, price: Double)

final case class Position(asset: Asset, amount: Double)

object Asset {
//  implicit val decoder: JsonDecoder[Asset] = DeriveJsonDecoder.gen[Asset]
//  implicit val encoder: JsonEncoder[Asset] = DeriveJsonEncoder.gen[Asset]
}