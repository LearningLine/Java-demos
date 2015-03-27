package com.develop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


public class UnmodifiableListCollector<T> implements Collector<T, List<T>, List<T>>
{

	@Override
	public Supplier<List<T>> supplier() {
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<T>, T> accumulator() {
		return List::add;
	}

	@Override
	public BinaryOperator<List<T>> combiner() {
		
		return (left, right) -> {
            left.addAll(right);
            return left;
        };
	}

	@Override
	public Function<List<T>, List<T>> finisher() {
		return Collections::unmodifiableList;
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return new TreeSet<java.util.stream.Collector.Characteristics>();
	}
	
}