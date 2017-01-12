package hive
import grails.rest.RestfulController

class QuoteController extends RestfulController{

   def index() {
		
		createQuote();
	}
	
	def createQuote()
	{
		
		render "hello world"
	}
}
