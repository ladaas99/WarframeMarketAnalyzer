package enums.fields;

public enum RelicFieldEnum implements IFieldEnum {
	HrAvgInt48("48HrAvg(Int)"),
	HrAvgEx48("48HrAvg(Ex)"),
	HrAvgFlaw48("48HrAvg(Flaw)"),
	HrAvgRad48("48HrAvg(Rad)"),
	HrLowInt48("48HrLow(Int)"),
	HrHighInt48("48HrHigh(Int)"),
	HrLowRad48("48HrLow(Rad)"),
	HrHighRad48("48HrHigh(Rad)"),
	HrNumSalesInt48("48HrNumSales(Int)"),
	HrNumSalesEx48("48HrNumSales(Ex)"),
	HrNumSalesFlaw48("48HrNumSales(Flaw)"),
	HrNumSalesRad48("48HrNumSales(Rad)"),
	DayAvgInt90("90DayAvg(Int)"),
	DayAvgEx90("90DayAvg(Ex)"),
	DayAvgFlaw90("90DayAvg(Flaw)"),
	DayAvgRad90("90DayAvg(Rad)"),
	DayLowInt90("90DayLow(Int)"),
	DayHighInt90("90DayHigh(Int)"),
	DayLowRad90("90DayLow(Rad)"),
	DayHighRad90("90DayHigh(Rad)"),
	DayNumSalesInt90("90DayNumSales(Int)"),
	DayNumSalesEx90("90DayNumSales(Ex)"),
	DayNumSalesFlaw90("90DayNumSales(Flaw)"),
	DayNumSalesRad90("90DayNumSales(Rad)"),
	CommonDrop1("CommonDrop1"),
	CommonDrop2("CommonDrop2"),
	CommonDrop3("CommonDrop3"),
	UncommonDrop1("UncommonDrop1"),
	UncommonDrop2("UncommonDrop2"),
	RareDrop("RareDrop"),
	CommonDrop1DucatVal("CommonDrop1DucatVal"),
	CommonDrop1AvgPlatVal48Hrs("CommonDrop1AvgPlatVal48Hrs"),
	CommonDrop1AvgPlatVal90Days("CommonDrop1AvgPlatVal90Days"),
	CommonDrop2DucatVal("CommonDrop2DucatVal"),
	CommonDrop2AvgPlatVal48Hrs("CommonDrop2AvgPlatVal48Hrs"),
	CommonDrop2AvgPlatVal90Days("CommonDrop2AvgPlatVal90Days"),
	CommonDrop3DucatVal("CommonDrop3DucatVal"),
	CommonDrop3AvgPlatVal48Hrs("CommonDrop3AvgPlatVal48Hrs"),
	CommonDrop3AvgPlatVal90Days("CommonDrop3AvgPlatVal90Days"),
	UncommonDrop1DucatVal("UncommonDrop1DucatVal"),
	UncommonDrop1AvgPlatVal48Hrs("UncommonDrop1AvgPlatVal48Hrs"),
	UncommonDrop1AvgPlatVal90Days("UncommonDrop1AvgPlatVal90Days"),
	UncommonDrop2DucatVal("UncommonDrop2DucatVal"),
	UncommonDrop2AvgPlatVal48Hrs("UncommonDrop2AvgPlatVal48Hrs"),
	UncommonDrop2AvgPlatVal90Days("UncommonDrop2AvgPlatVal90Days"),
	RareDropDucatVal("RareDropDucatVal"),
	RareDropAvgPlatVal48Hrs("RareDropAvgPlatVal48Hrs"),
	RareDropAvgPlatVal90Days("RareDropAvgPlatVal90Days"),
	CommonDrop1ItemName("CommonDrop1ItemName"),
	CommonDrop1PartName("CommonDrop1PartName"),
	CommonDrop2ItemName("CommonDrop2ItemName"),
	CommonDrop2PartName("CommonDrop2PartName"),
	CommonDrop3ItemName("CommonDrop3ItemName"),
	CommonDrop3PartName("CommonDrop3PartName"),
	UncommonDrop1ItemName("UncommonDrop1ItemName"),
	UncommonDrop1PartName("UncommonDrop1PartName"),
	UncommonDrop2ItemName("UncommonDrop2ItemName"),
	UncommonDrop2PartName("UncommonDrop2PartName"),
	RareDropItemName("RareDropItemName"),
	RareDropPartName("RareDropPartName"),
	DropsForma("DropsForma"),
	DropsFormaCommon("DropsFormaCommon"),
	DropsFormaUncommon("DropsFormaUncommon"),
	IsVaulted("IsVaulted"),
	IsBaroExclusive("IsBaroExclusive"),
	AvgDucatValInt("AvgDucatVal(Int)"),
	AvgDucatValEx("AvgDucatVal(Ex)"),
	AvgDucatValFlaw("AvgDucatVal(Flaw)"),
	AvgDucatValRad("AvgDucatVal(Rad)"),
	AvgPlatVal48HrsInt("AvgPlatVal48Hrs(Int)"),
	AvgPlatVal48HrsEx("AvgPlatVal48Hrs(Ex)"),
	AvgPlatVal48HrsFlaw("AvgPlatVal48Hrs(Flaw)"),
	AvgPlatVal48HrsRad("AvgPlatVal48Hrs(Rad)"),
	AvgPlatVal90DaysInt("AvgPlatVal90Days(Int)"),
	AvgPlatVal90DaysEx("AvgPlatVal90Days(Ex)"),
	AvgPlatVal90DaysFlaw("AvgPlatVal90Days(Flaw)"),
	AvgPlatVal90DaysRad("AvgPlatVal90Days(Rad)"),
	BestAvgDucatRefinement("BestAvgDucatRefinement"),
	BestAvgPlatRefinement48Hrs("BestAvgPlatRefinement48Hrs"),
	BestAvgPlatRefinement90Days("BestAvgPlatRefinement90Days"),
	AvgDucatValChangeIntEx("AvgDucatValChange(Int=>Ex)"),
	AvgDucatValChangeIntFlaw("AvgDucatValChange(Int=>Flaw)"),
	AvgDucatValChangeIntRad("AvgDucatValChange(Int=>Rad)"),
	AvgDucatValChangeExFlaw("AvgDucatValChange(Ex=>Flaw)"),
	AvgDucatValChangeExRad("AvgDucatValChange(Ex=>Rad)"),
	AvgDucatValChangeFlawRad("AvgDucatValChange(Flaw=>Rad)"),
	AvgPlatVal48HrsChangeIntEx("AvgPlatVal48HrsChange(Int=>Ex)"),
	AvgPlatVal48HrsChangeIntFlaw("AvgPlatVal48HrsChange(Int=>Flaw)"),
	AvgPlatVal48HrsChangeIntRad("AvgPlatVal48HrsChange(Int=>Rad)"),
	AvgPlatVal48HrsChangeExFlaw("AvgPlatVal48HrsChange(Ex=>Flaw)"),
	AvgPlatVal48HrsChangeExRad("AvgPlatVal48HrsChange(Ex=>Rad)"),
	AvgPlatVal48HrsChangeFlawRad("AvgPlatVal48HrsChange(Flaw=>Rad)"),
	AvgPlatVal90DaysChangeIntEx("AvgPlatVal90DaysChange(Int=>Ex)"),
	AvgPlatVal90DaysChangeIntFlaw("AvgPlatVal90DaysChange(Int=>Flaw)"),
	AvgPlatVal90DaysChangeIntRad("AvgPlatVal90DaysChange(Int=>Rad)"),
	AvgPlatVal90DaysChangeExFlaw("AvgPlatVal90DaysChange(Ex=>Flaw)"),
	AvgPlatVal90DaysChangeExRad("AvgPlatVal90DaysChange(Ex=>Rad)"),
	AvgPlatVal90DaysChangeFlawRad("AvgPlatVal90DaysChange(Flaw=>Rad)"),
	AvgDucatValChangePerTraceIntEx("AvgDucatValChangePerTrace(Int=>Ex)"),
	AvgDucatValChangePerTraceIntFlaw("AvgDucatValChangePerTrace(Int=>Flaw)"),
	AvgDucatValChangePerTraceIntRad("AvgDucatValChangePerTrace(Int=>Rad)"),
	AvgDucatValChangePerTraceExFlaw("AvgDucatValChangePerTrace(Ex=>Flaw)"),
	AvgDucatValChangePerTraceExRad("AvgDucatValChangePerTrace(Ex=>Rad)"),
	AvgDucatValChangePerTraceFlawRad("AvgDucatValChangePerTrace(Flaw=>Rad)"),
	AvgPlatVal48HrsChangePerTraceIntEx("AvgPlatVal48HrsChangePerTrace(Int=>Ex)"),
	AvgPlatVal48HrsChangePerTraceIntFlaw("AvgPlatVal48HrsChangePerTrace(Int=>Flaw)"),
	AvgPlatVal48HrsChangePerTraceIntRad("AvgPlatVal48HrsChangePerTrace(Int=>Rad)"),
	AvgPlatVal48HrsChangePerTraceExFlaw("AvgPlatVal48HrsChangePerTrace(Ex=>Flaw)"),
	AvgPlatVal48HrsChangePerTraceExRad("AvgPlatVal48HrsChangePerTrace(Ex=>Rad)"),
	AvgPlatVal48HrsChangePerTraceFlawRad("AvgPlatVal48HrsChangePerTrace(Flaw=>Rad)"),
	AvgPlatVal90DaysChangePerTraceIntEx("AvgPlatVal90DaysChangePerTrace(Int=>Ex)"),
	AvgPlatVal90DaysChangePerTraceIntFlaw("AvgPlatVal90DaysChangePerTrace(Int=>Flaw)"),
	AvgPlatVal90DaysChangePerTraceIntRad("AvgPlatVal90DaysChangePerTrace(Int=>Rad)"),
	AvgPlatVal90DaysChangePerTraceExFlaw("AvgPlatVal90DaysChangePerTrace(Ex=>Flaw)"),
	AvgPlatVal90DaysChangePerTraceExRad("AvgPlatVal90DaysChangePerTrace(Ex=>Rad)"),
	AvgPlatVal90DaysChangePerTraceFlawRad("AvgPlatVal90DaysChangePerTrace(Flaw=>Rad)"),
	IntShareAvgDucatVal("IntShareAvgDucatVal"),
	IntShareAvgPlatVal48Hrs("IntShareAvgPlatVal48Hrs"),
	IntShareAvgPlatVal90Days("IntShareAvgPlatVal90Days"),
	RadShareAvgDucatVal("RadShareAvgDucatVal"),
	RadShareAvgPlatValue48Hrs("RadShareAvgPlatValue48Hrs"),
	RadShareAvgPlatValue90Days("RadShareAvgPlatValue90Days"),
	;

	private String defaultDisplayName;
	
	private RelicFieldEnum() {
		this(null);
	}

	private RelicFieldEnum(String defaultDisplayName) {
		this.defaultDisplayName = defaultDisplayName;
	}
	
	@Override
	public String getDisplayName() {
		if (defaultDisplayName != null) {
			return defaultDisplayName;
		}
		return name();
	}
	
	@Override
	public String toString() {
		return getDisplayName();
	}
}
